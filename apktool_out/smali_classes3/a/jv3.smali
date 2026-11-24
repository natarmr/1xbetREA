.class public final synthetic La/jv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/ov3;ZZB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/jv3;->a:B

    iput-object p1, p0, La/jv3;->b:Ljava/lang/Object;

    iput-boolean p2, p0, La/jv3;->c:Z

    iput-boolean p3, p0, La/jv3;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZZLandroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/jv3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/jv3;->c:Z

    iput-boolean p2, p0, La/jv3;->d:Z

    iput-object p3, p0, La/jv3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/jv3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/jv3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v2, p0, La/jv3;->d:Z

    .line 6
    .line 7
    iget-boolean p0, p0, La/jv3;->c:Z

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    new-instance v0, La/im60;

    .line 15
    .line 16
    invoke-direct {v0}, La/im60;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v3, La/im60;->i2:[La/iiy;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aget-object v4, v3, v4

    .line 23
    .line 24
    iget-object v5, v0, La/im60;->e2:La/cgx0;

    .line 25
    .line 26
    invoke-virtual {v5, v0, v4, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    aget-object p0, v3, p0

    .line 31
    .line 32
    iget-object v4, v0, La/im60;->f2:La/phf0;

    .line 33
    .line 34
    const-string v5, "REQUEST_ACTION_SELECTOR_DIALOG_KEY"

    .line 35
    .line 36
    invoke-virtual {v4, v0, p0, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    aget-object p0, v3, p0

    .line 41
    .line 42
    iget-object v3, v0, La/im60;->g2:La/cgx0;

    .line 43
    .line 44
    invoke-virtual {v3, v0, p0, v2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v0, p0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    check-cast v1, La/ov3;

    .line 58
    .line 59
    invoke-virtual {v1, p0, v2}, La/ov3;->d(ZZ)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    check-cast v1, La/ov3;

    .line 66
    .line 67
    invoke-virtual {v1, p0, v2}, La/ov3;->d(ZZ)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast v1, La/ov3;

    .line 74
    .line 75
    invoke-virtual {v1, p0, v2}, La/ov3;->d(ZZ)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
