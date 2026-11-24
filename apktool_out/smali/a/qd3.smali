.class public final synthetic La/qd3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hky;


# instance fields
.field public final synthetic a:La/rd3;


# direct methods
.method public synthetic constructor <init>(La/rd3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qd3;->a:La/rd3;

    return-void
.end method


# virtual methods
.method public final f(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/qd3;->a:La/rd3;

    invoke-virtual {p0, p1}, La/rd3;->f(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method
