.class public final La/vc9;
.super La/uke;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/vc9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;La/y9g0;)La/vke;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vc9;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, La/uke;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;La/y9g0;)La/vke;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-class p0, Lokhttp3/RequestBody;

    .line 12
    .line 13
    invoke-static {p1}, La/ay3;->S(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    sget-object p0, La/lwf;->e:La/lwf;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;La/y9g0;)La/vke;
    .locals 3

    .line 1
    iget-byte p0, p0, La/vc9;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, La/ay3;->S(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-class v2, Ljava/util/Optional;

    .line 13
    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 18
    .line 19
    invoke-static {v0, p1}, La/ay3;->R(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p3, p0, p2}, La/y9g0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)La/vke;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v1, La/yox;

    .line 28
    .line 29
    invoke-direct {v1, p0}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-object v1

    .line 33
    :pswitch_0
    const-class p0, Lokhttp3/ResponseBody;

    .line 34
    .line 35
    if-ne p1, p0, :cond_2

    .line 36
    .line 37
    const-class p0, La/wrm0;

    .line 38
    .line 39
    invoke-static {p2, p0}, La/ay3;->X([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    sget-object v1, La/ujn;->e:La/ujn;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    sget-object v1, La/m2a;->f:La/m2a;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-class p0, Ljava/lang/Void;

    .line 52
    .line 53
    if-ne p1, p0, :cond_3

    .line 54
    .line 55
    sget-object v1, La/rv00;->f:La/rv00;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    sget-boolean p0, La/ay3;->o:Z

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    :try_start_0
    const-class p0, Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    if-ne p1, p0, :cond_4

    .line 65
    .line 66
    sget-object v1, La/jtv;->d:La/jtv;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catch_0
    sput-boolean v0, La/ay3;->o:Z

    .line 70
    .line 71
    :cond_4
    :goto_1
    return-object v1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
