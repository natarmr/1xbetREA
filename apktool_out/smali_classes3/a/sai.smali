.class public final La/sai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/pai;


# direct methods
.method public constructor <init>(La/pai;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sai;->a:La/pai;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 8

    .line 1
    new-instance v0, La/e09;

    .line 2
    .line 3
    iget-object p0, p0, La/sai;->a:La/pai;

    .line 4
    .line 5
    iget-object p0, p0, La/pai;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/esg0;

    .line 8
    .line 9
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/oeg0;

    .line 13
    .line 14
    iget-object v1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v1

    .line 17
    check-cast v3, La/ctf0;

    .line 18
    .line 19
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/cad;

    .line 22
    .line 23
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/psc;

    .line 26
    .line 27
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v5, La/xoc;

    .line 35
    .line 36
    iget-object v1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/ehf0;

    .line 39
    .line 40
    iget-object v1, v1, La/ehf0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, La/i7i;

    .line 43
    .line 44
    invoke-virtual {v1}, La/i7i;->h()La/jr0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-direct {v5, v1, v6}, La/xoc;-><init>(La/jr0;Z)V

    .line 53
    .line 54
    .line 55
    new-instance v6, La/gut;

    .line 56
    .line 57
    new-instance v1, La/do20;

    .line 58
    .line 59
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/gw8;

    .line 62
    .line 63
    invoke-direct {v1, p0}, La/do20;-><init>(La/gw8;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v6, v1}, La/gut;-><init>(La/do20;)V

    .line 67
    .line 68
    .line 69
    new-instance v7, La/gut;

    .line 70
    .line 71
    new-instance v1, La/do20;

    .line 72
    .line 73
    invoke-direct {v1, p0}, La/do20;-><init>(La/gw8;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v7, v1}, La/gut;-><init>(La/do20;)V

    .line 77
    .line 78
    .line 79
    move-object v1, p1

    .line 80
    invoke-direct/range {v0 .. v7}, La/e09;-><init>(La/vzg0;La/oeg0;La/ctf0;La/mne;La/xoc;La/gut;La/gut;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
