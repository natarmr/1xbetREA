.class public final La/jbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/r5i;


# direct methods
.method public constructor <init>(La/r5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jbi;->a:La/r5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/bm2;

    .line 2
    .line 3
    iget-object p0, p0, La/jbi;->a:La/r5i;

    .line 4
    .line 5
    iget-object p0, p0, La/r5i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/pbi;

    .line 8
    .line 9
    iget-object v2, p0, La/pbi;->h:La/mne;

    .line 10
    .line 11
    iget-object v3, p0, La/pbi;->e:La/ctf0;

    .line 12
    .line 13
    iget-object v4, p0, La/pbi;->i:La/gg5;

    .line 14
    .line 15
    iget-object v5, p0, La/pbi;->j:La/pru;

    .line 16
    .line 17
    iget-object v6, p0, La/pbi;->k:La/s31;

    .line 18
    .line 19
    move-object v1, p1

    .line 20
    invoke-direct/range {v0 .. v6}, La/bm2;-><init>(La/vzg0;La/mne;La/ctf0;La/gg5;La/pru;La/s31;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
