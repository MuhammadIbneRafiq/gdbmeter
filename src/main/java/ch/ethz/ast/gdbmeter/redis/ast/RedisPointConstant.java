package ch.ethz.ast.gdbmeter.redis.ast;

import ch.ethz.ast.gdbmeter.cypher.ast.CypherConstant;
import java.util.Locale;

public class RedisPointConstant extends CypherConstant {

    private final double longitude;
    private final double latitude;

    public RedisPointConstant(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String getTextRepresentation() {
        return String.format(Locale.US, "point({ longitude: %f, latitude: %f })", longitude, latitude);
    }
}
