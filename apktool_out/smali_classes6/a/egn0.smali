.class public final synthetic La/egn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:La/hgn0;


# direct methods
.method public synthetic constructor <init>(La/hgn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/egn0;->a:La/hgn0;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    sget-object p1, La/hgn0;->k2:La/m6m0;

    .line 2
    .line 3
    sget-object p1, La/fhn0;->a:La/fhn0;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object p0, p0, La/egn0;->a:La/hgn0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/hgn0;->Z0(La/fhn0;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
