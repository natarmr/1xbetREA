.class public final La/xmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xmi;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/cy70;

    .line 2
    .line 3
    iget-object p0, p0, La/xmi;->a:La/rki;

    .line 4
    .line 5
    iget-object p0, p0, La/rki;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ymi;

    .line 8
    .line 9
    iget-object v1, p0, La/ymi;->a:La/xzp;

    .line 10
    .line 11
    iget-object v1, v1, La/xzp;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/ctf0;

    .line 15
    .line 16
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/ymi;->a:La/xzp;

    .line 20
    .line 21
    iget-object v3, v1, La/xzp;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, La/rpt;

    .line 24
    .line 25
    iget-object v4, v1, La/xzp;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, La/mne;

    .line 28
    .line 29
    iget-object v5, v1, La/xzp;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/svu;

    .line 32
    .line 33
    new-instance v6, La/yo4;

    .line 34
    .line 35
    iget-object v7, v1, La/xzp;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/kt2;

    .line 38
    .line 39
    invoke-static {v7}, La/x1x;->y(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/16 v8, 0x9

    .line 43
    .line 44
    invoke-direct {v6, v7, v8}, La/yo4;-><init>(La/kt2;B)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, La/xzp;->g:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v7, v1

    .line 50
    check-cast v7, La/zr1;

    .line 51
    .line 52
    iget-object v8, p0, La/ymi;->b:La/jvp0;

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    invoke-direct/range {v0 .. v8}, La/cy70;-><init>(La/vzg0;La/ctf0;La/rpt;La/mne;La/svu;La/yo4;La/zr1;La/jvp0;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
