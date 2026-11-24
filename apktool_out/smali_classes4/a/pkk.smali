.class public final La/pkk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/qkk;


# direct methods
.method public constructor <init>(ILa/qkk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/pkk;->a:I

    .line 5
    .line 6
    iput-object p2, p0, La/pkk;->b:La/qkk;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/pkk;->b:La/qkk;

    .line 5
    .line 6
    iget-object v0, p1, La/qkk;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget p0, p0, La/pkk;->a:I

    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p1, La/qkk;->d:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
