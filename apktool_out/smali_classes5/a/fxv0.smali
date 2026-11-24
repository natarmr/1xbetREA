.class public final La/fxv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:Landroid/view/Window;


# direct methods
.method public constructor <init>(ZLandroid/view/Window;Landroid/view/Window;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/fxv0;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/fxv0;->b:Landroid/view/Window;

    .line 7
    .line 8
    iput-object p3, p0, La/fxv0;->c:Landroid/view/Window;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/fxv0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/fxv0;->b:Landroid/view/Window;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, La/hxv0;->b(Landroid/view/Window;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/fxv0;->c:Landroid/view/Window;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/hxv0;->b(Landroid/view/Window;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method
