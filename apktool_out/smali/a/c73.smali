.class public final synthetic La/c73;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$DurationScaleChangeListener;


# instance fields
.field public final synthetic a:La/c5k;


# direct methods
.method public synthetic constructor <init>(La/c5k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c73;->a:La/c5k;

    return-void
.end method


# virtual methods
.method public final onChanged(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/c73;->a:La/c5k;

    .line 2
    .line 3
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/e73;

    .line 6
    .line 7
    iput p1, p0, La/e73;->g:F

    .line 8
    .line 9
    return-void
.end method
