package a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface z190 {
    boolean encoded() default false;

    String value();
}
