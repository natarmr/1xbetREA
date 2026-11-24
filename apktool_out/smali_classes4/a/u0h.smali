.class public final synthetic La/u0h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/spg;


# direct methods
.method public synthetic constructor <init>(La/spg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u0h;->a:B

    iput-object p1, p0, La/u0h;->b:La/spg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/u0h;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object p0, p0, La/u0h;->b:La/spg;

    .line 5
    .line 6
    check-cast p1, La/cp;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    check-cast v0, La/qth;

    .line 17
    .line 18
    iget-object v2, v0, La/qth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, La/qth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, La/v0h;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {v1, p0, p1, v2}, La/v0h;-><init>(La/spg;La/cp;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ok;

    .line 38
    .line 39
    const/16 v0, 0x18

    .line 40
    .line 41
    invoke-direct {p0, p1, p1, v0}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 51
    .line 52
    check-cast v0, La/jth;

    .line 53
    .line 54
    iget-object v2, v0, La/jth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, La/jth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v1, La/v0h;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct {v1, p0, p1, v2}, La/v0h;-><init>(La/spg;La/cp;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 71
    .line 72
    .line 73
    new-instance p0, La/ok;

    .line 74
    .line 75
    const/16 v0, 0x16

    .line 76
    .line 77
    invoke-direct {p0, p1, p1, v0}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
