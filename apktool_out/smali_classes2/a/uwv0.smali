.class public final La/uwv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Landroid/view/Window;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uwv0;->a:Landroid/view/Window;

    .line 5
    .line 6
    iput-boolean p2, p0, La/uwv0;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, La/uwv0;->a:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, La/uwv0;->b:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, La/nkk0;->a(Landroid/view/Window;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
