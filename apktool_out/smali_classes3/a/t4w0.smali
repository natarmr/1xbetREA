.class public interface abstract La/t4w0;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J,\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lorg/xplatform/captcha/impl/data/datasource/CaptchaApi;",
        "",
        "La/x6a;",
        "request",
        "",
        "pushCaptcha",
        "La/jtf0;",
        "La/b7a;",
        "a",
        "(La/x6a;Ljava/lang/String;La/yje;)Ljava/lang/Object;",
        "org.xplatform.secret.captcha:impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(La/x6a;Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .param p1    # La/x6a;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Push-Captcha"
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "/captcha/v1/GetCaptcha"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/x6a;",
            "Ljava/lang/String;",
            "La/yje<",
            "-",
            "La/jtf0<",
            "La/b7a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
