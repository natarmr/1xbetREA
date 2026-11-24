.class public final synthetic La/ti6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(La/fli;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    iput-byte p1, p0, La/ti6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/ti6;->b:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ti6;->a:B

    iput-object p1, p0, La/ti6;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ti6;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ti6;->b:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, La/hvm0;->j2:La/y2m0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v0, "SUB_GAME_FILTERS_DIALOG_TAG"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v1, La/hvm0;

    .line 40
    .line 41
    invoke-direct {v1}, La/hvm0;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    invoke-static {p0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :pswitch_4
    return-object p0

    .line 60
    :pswitch_5
    invoke-static {p0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_6
    invoke-static {p0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
