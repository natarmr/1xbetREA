.class public La/tre0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(La/qer;)La/jhy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public b(Ljava/lang/Class;)La/sgy;
    .locals 0

    .line 1
    new-instance p0, La/bmc;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La/bmc;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Ljava/lang/Class;)La/ghy;
    .locals 0

    .line 1
    new-instance p0, La/wg80;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La/wg80;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(La/cz40;)La/rhy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public e(La/dz40;)La/thy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public f(La/h0d0;)La/eiy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public g(La/i0d0;)La/giy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public h(La/k0d0;)La/hiy;
    .locals 0

    .line 1
    return-object p1
.end method

.method public i(La/ger;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p1, 0x0

    .line 10
    aget-object p0, p0, p1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "kotlin.jvm.functions."

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/16 p1, 0x15

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_0
    return-object p0
.end method

.method public j(La/guy;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/tre0;->i(La/ger;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public k(La/sgy;Ljava/util/List;Z)La/kiy;
    .locals 0

    .line 1
    new-instance p0, La/szs0;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, La/szs0;-><init>(La/fhy;Ljava/util/List;Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
