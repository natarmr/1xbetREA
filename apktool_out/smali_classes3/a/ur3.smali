.class public final La/ur3;
.super La/q1r;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ur3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/ur3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    instance-of p0, p2, La/of80;

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    move-object p0, p2

    .line 12
    check-cast p0, La/of80;

    .line 13
    .line 14
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, La/i1w0;->c()La/mf50;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p2, La/ka6;

    .line 39
    .line 40
    const/16 v0, 0xb

    .line 41
    .line 42
    invoke-direct {p2, p0, v0}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, La/mf50;->g(Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/ur3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-static {p2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D(Landroidx/fragment/app/Fragment;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-static {p0, p1}, La/ujk;->a(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/ur3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-static {p2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D(Landroidx/fragment/app/Fragment;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p1, La/ujk;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance p2, La/oz7;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p2, p0, v0}, La/oz7;-><init>(Landroid/view/View;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 22
    .line 23
    .line 24
    new-instance p0, La/vbk;

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    invoke-direct {p0, p2}, La/vbk;-><init>(B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p0}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
