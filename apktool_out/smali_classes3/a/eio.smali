.class public final La/eio;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n0o0;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, La/rta0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La/rta0;-><init>(La/gii0;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/eio;->a:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/rrc;B)V
    .locals 1

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/dio;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/eio;->a:La/n0o0;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/dio;

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/eio;->a:La/n0o0;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, La/sz2;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, La/sz2;-><init>(Ljava/lang/Object;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/eio;->a:La/n0o0;

    return-void
.end method


# virtual methods
.method public a()La/tt20;
    .locals 0

    .line 1
    iget-object p0, p0, La/eio;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tt20;

    .line 8
    .line 9
    return-object p0
.end method

.method public b(La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/eio;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nbo;

    .line 8
    .line 9
    iget-object p0, p0, La/nbo;->a:La/zdg0;

    .line 10
    .line 11
    new-instance v0, La/f1e;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/16 v2, 0x12

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v1, v3, v2}, La/f1e;-><init>(ILa/yje;B)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, p0, v0, v1, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public c()Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, La/eio;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    return-object p0
.end method
