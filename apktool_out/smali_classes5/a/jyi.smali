.class public final La/jyi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/yxi;


# direct methods
.method public constructor <init>(La/yxi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jyi;->a:La/yxi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/dws0;

    .line 2
    .line 3
    iget-object p0, p0, La/jyi;->a:La/yxi;

    .line 4
    .line 5
    iget-object p0, p0, La/yxi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/kyi;

    .line 8
    .line 9
    iget-object v1, p0, La/kyi;->a:La/sd60;

    .line 10
    .line 11
    iget-object v2, v1, La/sd60;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/mne;

    .line 14
    .line 15
    iget-object v3, v1, La/sd60;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/ojj;

    .line 18
    .line 19
    iget-object v1, v1, La/sd60;->b:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, v1

    .line 22
    check-cast v4, La/ctf0;

    .line 23
    .line 24
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, La/kyi;->a:La/sd60;

    .line 28
    .line 29
    iget-object v5, v1, La/sd60;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/duj;

    .line 32
    .line 33
    iget-object v6, p0, La/kyi;->b:La/i1w0;

    .line 34
    .line 35
    iget-object v7, v1, La/sd60;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/m1e;

    .line 38
    .line 39
    invoke-static {v7}, La/x1x;->y(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v1, La/sd60;->i:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, La/s9m0;

    .line 46
    .line 47
    iget-object p0, p0, La/kyi;->c:La/ok50;

    .line 48
    .line 49
    iget-object p0, p0, La/ok50;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, La/v8i;

    .line 52
    .line 53
    invoke-virtual {p0}, La/v8i;->a()La/im4;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    move-object v1, p1

    .line 58
    invoke-direct/range {v0 .. v9}, La/dws0;-><init>(La/vzg0;La/mne;La/ojj;La/ctf0;La/duj;La/i1w0;La/m1e;La/s9m0;La/im4;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method
