.class public final synthetic La/bb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/bb4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bb4;->b:Landroid/view/View;

    iput-object p2, p0, La/bb4;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/bb4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bb4;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/bb4;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bb4;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bb4;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/bb4;->b:Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/lwk;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Landroidx/fragment/app/e;->H(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, La/x6s;

    .line 23
    .line 24
    const/4 v0, 0x5

    .line 25
    invoke-direct {p1, v1, v0}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 26
    .line 27
    .line 28
    const-string v0, "KEY_LANDSCAPE_VIDEO_REQUEST"

    .line 29
    .line 30
    invoke-static {p0, v0, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/va4;

    .line 34
    .line 35
    invoke-direct {p1, p0}, La/va4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    check-cast p1, La/j6z;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-float p0, p0

    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-static {p1, v0}, La/k7x;->z(La/j6z;Z)La/jge0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget p1, p1, La/jge0;->d:F

    .line 55
    .line 56
    sub-float/2addr p0, p1

    .line 57
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
