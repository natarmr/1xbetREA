.class public final La/s7y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dlz;


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:La/llo;

.field public final synthetic c:La/q7y;


# direct methods
.method public constructor <init>(La/ilz;Landroid/view/Window;La/llo;La/q7y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/s7y;->a:Landroid/view/Window;

    .line 5
    .line 6
    iput-object p3, p0, La/s7y;->b:La/llo;

    .line 7
    .line 8
    iput-object p4, p0, La/s7y;->c:La/q7y;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/s7y;->a:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, La/s7y;->b:La/llo;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, La/s7y;->c:La/q7y;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
