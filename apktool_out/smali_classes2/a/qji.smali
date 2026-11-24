.class public final La/qji;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/tii;


# direct methods
.method public constructor <init>(La/tii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qji;->a:La/tii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 3

    .line 1
    new-instance v0, La/yxz;

    .line 2
    .line 3
    iget-object p0, p0, La/qji;->a:La/tii;

    .line 4
    .line 5
    iget-object p0, p0, La/tii;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rji;

    .line 8
    .line 9
    iget-object v1, p0, La/rji;->a:La/ctf0;

    .line 10
    .line 11
    iget-object v2, p0, La/rji;->b:La/uxz;

    .line 12
    .line 13
    iget-object p0, p0, La/rji;->c:La/cad;

    .line 14
    .line 15
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/psc;

    .line 18
    .line 19
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1, v2, p0}, La/yxz;-><init>(La/vzg0;La/ctf0;La/uxz;La/mne;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method
