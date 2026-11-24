.class public final La/xc3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bh60;


# instance fields
.field public final synthetic a:La/yc3;


# direct methods
.method public constructor <init>(La/yc3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xc3;->a:La/yc3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/xc3;->a:La/yc3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/yc3;->t()La/hd3;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, La/hd3;->m()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/agd;->d:La/nw20;

    .line 11
    .line 12
    iget-object p0, p0, La/nw20;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/kd30;

    .line 15
    .line 16
    const-string v0, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/kd30;->H(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, La/hd3;->q(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
