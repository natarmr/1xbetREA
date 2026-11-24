.class public interface abstract La/kzk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ0\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\nJ0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\nJ0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\n\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "La/kzk;",
        "",
        "",
        "auth",
        "La/iv5;",
        "request",
        "La/q16;",
        "La/y0l;",
        "La/i2o;",
        "b",
        "(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;",
        "La/uv5;",
        "e",
        "(Ljava/lang/String;La/uv5;La/yje;)Ljava/lang/Object;",
        "La/c320;",
        "c",
        "(Ljava/lang/String;La/c320;La/yje;)Ljava/lang/Object;",
        "d",
        "a",
        "f",
        "domino"
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
.method public abstract a(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/iv5;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/SkipStep"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/iv5;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/iv5;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/GetActiveGame"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/iv5;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;La/c320;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/c320;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/MakeAction"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/c320;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/iv5;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/TakeFromBank"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/iv5;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;La/uv5;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/uv5;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/MakeBetGame"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/uv5;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime La/xpv;
            value = "X-Auth"
        .end annotation
    .end param
    .param p2    # La/iv5;
        .annotation runtime La/jb8;
        .end annotation
    .end param
    .annotation runtime La/kg80;
        value = "Games/Main/Domino/Surrender"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/iv5;",
            "La/yje<",
            "-",
            "La/q16<",
            "La/y0l;",
            "+",
            "La/i2o;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
