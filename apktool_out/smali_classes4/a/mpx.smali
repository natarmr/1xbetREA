.class public final La/mpx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/btr;


# direct methods
.method public constructor <init>(La/btr;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mpx;->a:La/btr;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/mpx;->a:La/btr;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/mpx;->a:La/btr;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/xsr;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/mpx;->a:La/btr;

    .line 2
    .line 3
    iget-object p0, p0, La/btr;->b:La/ysr;

    .line 4
    .line 5
    iget-object p0, p0, La/ysr;->a:La/qoj0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/wne;->a:La/wne;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    :goto_0
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    :goto_1
    if-ne p0, p1, :cond_2

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/mpx;->a:La/btr;

    .line 2
    .line 3
    iget-object p0, p0, La/btr;->a:La/m49;

    .line 4
    .line 5
    iget-object p0, p0, La/m49;->a:La/p7m0;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/mpx;->a:La/btr;

    .line 2
    .line 3
    iget-object p0, p0, La/btr;->c:La/nhv0;

    .line 4
    .line 5
    iget-object v0, p0, La/nhv0;->a:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/nhv0;->b:La/p7m0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
