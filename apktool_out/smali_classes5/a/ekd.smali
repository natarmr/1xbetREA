.class public final La/ekd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final a:Landroidx/compose/ui/platform/ComposeView;

.field public final b:Landroidx/compose/ui/platform/ComposeView;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/ui/platform/ComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ekd;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    iput-object p2, p0, La/ekd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/view/View;)La/ekd;
    .locals 1

    .line 1
    check-cast p0, Landroidx/compose/ui/platform/ComposeView;

    .line 2
    .line 3
    new-instance v0, La/ekd;

    .line 4
    .line 5
    invoke-direct {v0, p0, p0}, La/ekd;-><init>(Landroidx/compose/ui/platform/ComposeView;Landroidx/compose/ui/platform/ComposeView;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/ekd;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 2
    .line 3
    return-object p0
.end method
