.class public final La/rni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/omi;


# direct methods
.method public constructor <init>(La/omi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rni;->a:La/omi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/no90;

    .line 2
    .line 3
    iget-object p0, p0, La/rni;->a:La/omi;

    .line 4
    .line 5
    iget-object p0, p0, La/omi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/sni;

    .line 8
    .line 9
    new-instance v1, La/gnu;

    .line 10
    .line 11
    new-instance v2, La/dq00;

    .line 12
    .line 13
    iget-object v3, p0, La/sni;->b:La/yp90;

    .line 14
    .line 15
    iget-object v4, p0, La/sni;->c:La/imb;

    .line 16
    .line 17
    invoke-direct {v2, v3, v4}, La/dq00;-><init>(La/yp90;La/imb;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, La/gnu;-><init>(La/dq00;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, La/sni;->d:La/cad;

    .line 24
    .line 25
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, La/psc;

    .line 28
    .line 29
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, La/sni;->e:La/duj;

    .line 37
    .line 38
    iget-object v4, p0, La/sni;->f:Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 39
    .line 40
    new-instance v5, La/fnu;

    .line 41
    .line 42
    new-instance v6, La/dq00;

    .line 43
    .line 44
    iget-object v7, p0, La/sni;->b:La/yp90;

    .line 45
    .line 46
    iget-object v8, p0, La/sni;->c:La/imb;

    .line 47
    .line 48
    invoke-direct {v6, v7, v8}, La/dq00;-><init>(La/yp90;La/imb;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v5, v6}, La/fnu;-><init>(La/dq00;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, La/cyu;

    .line 55
    .line 56
    new-instance v6, La/b4j;

    .line 57
    .line 58
    iget-object v8, p0, La/sni;->i:La/kt2;

    .line 59
    .line 60
    const/4 v9, 0x3

    .line 61
    invoke-direct {v6, v8, v9}, La/b4j;-><init>(La/kt2;B)V

    .line 62
    .line 63
    .line 64
    iget-object v8, p0, La/sni;->j:La/je;

    .line 65
    .line 66
    iget-object v9, p0, La/sni;->k:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 67
    .line 68
    invoke-direct {v7, v6, v8, v9}, La/cyu;-><init>(La/b4j;La/je;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 69
    .line 70
    .line 71
    iget-object v8, p0, La/sni;->a:La/ctf0;

    .line 72
    .line 73
    iget-object v9, p0, La/sni;->h:La/pru;

    .line 74
    .line 75
    move-object v6, p1

    .line 76
    invoke-direct/range {v0 .. v9}, La/no90;-><init>(La/gnu;La/mne;La/duj;Lorg/xplatform/picker/api/presentation/PickerParams;La/fnu;La/vzg0;La/cyu;La/ctf0;La/pru;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method
