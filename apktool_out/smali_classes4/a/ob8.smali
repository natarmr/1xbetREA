.class public final synthetic La/ob8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qb8;


# direct methods
.method public synthetic constructor <init>(La/qb8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ob8;->a:B

    iput-object p1, p0, La/ob8;->b:La/qb8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ob8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ob8;->b:La/qb8;

    .line 4
    .line 5
    invoke-static {p1}, La/w6x;->m(Landroid/animation/ValueAnimator;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, La/qb8;->r:F

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, La/qb8;->m:F

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, La/qb8;->l:F

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
