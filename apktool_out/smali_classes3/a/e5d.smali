.class public final synthetic La/e5d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:I

.field public final synthetic d:La/l7m0;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Landroid/app/Activity;ILa/l7m0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e5d;->a:Landroid/view/Window;

    iput-object p2, p0, La/e5d;->b:Landroid/app/Activity;

    iput p3, p0, La/e5d;->c:I

    iput-object p4, p0, La/e5d;->d:La/l7m0;

    iput-boolean p5, p0, La/e5d;->e:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, La/e5d;->a:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 6
    .line 7
    iget-object v1, p0, La/e5d;->b:Landroid/app/Activity;

    .line 8
    .line 9
    iget v2, p0, La/e5d;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v1, v2, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget-object v4, p0, La/e5d;->d:La/l7m0;

    .line 17
    .line 18
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-boolean p0, p0, La/e5d;->e:Z

    .line 29
    .line 30
    xor-int/lit8 v5, p0, 0x1

    .line 31
    .line 32
    move v3, v2

    .line 33
    const v2, 0x7f0606d8

    .line 34
    .line 35
    .line 36
    invoke-static/range {v0 .. v5}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method
