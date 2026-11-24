.class public final La/fwi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/psi;


# direct methods
.method public constructor <init>(La/psi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fwi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 15

    .line 1
    new-instance v0, La/i3p0;

    .line 2
    .line 3
    iget-object p0, p0, La/fwi;->a:La/psi;

    .line 4
    .line 5
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gwi;

    .line 8
    .line 9
    iget-object v2, p0, La/gwi;->a:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 10
    .line 11
    new-instance v3, La/dyu;

    .line 12
    .line 13
    invoke-virtual {p0}, La/gwi;->a()La/ywu;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v3, v1}, La/dyu;-><init>(La/ywu;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, La/dyu;

    .line 21
    .line 22
    invoke-virtual {p0}, La/gwi;->a()La/ywu;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v4, v1}, La/dyu;-><init>(La/ywu;)V

    .line 27
    .line 28
    .line 29
    new-instance v5, La/clc;

    .line 30
    .line 31
    invoke-virtual {p0}, La/gwi;->a()La/ywu;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/16 v6, 0x9

    .line 36
    .line 37
    invoke-direct {v5, v1, v6}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iget-object v6, p0, La/gwi;->e:La/pru;

    .line 41
    .line 42
    iget-object v7, p0, La/gwi;->v:La/r9u;

    .line 43
    .line 44
    iget-object v8, p0, La/gwi;->y:La/m1e;

    .line 45
    .line 46
    iget-object v9, p0, La/gwi;->g:La/duj;

    .line 47
    .line 48
    iget-object v10, p0, La/gwi;->h:La/mne;

    .line 49
    .line 50
    iget-object v11, p0, La/gwi;->i:La/ctf0;

    .line 51
    .line 52
    iget-object v1, p0, La/gwi;->B:La/roi0;

    .line 53
    .line 54
    iget-object v1, v1, La/roi0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, La/daf;

    .line 57
    .line 58
    invoke-virtual {v1}, La/daf;->Z()La/zfm0;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    iget-object v13, p0, La/gwi;->b:La/i1w0;

    .line 63
    .line 64
    iget-object v14, p0, La/gwi;->A:La/g2v;

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    invoke-direct/range {v0 .. v14}, La/i3p0;-><init>(La/vzg0;Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;La/dyu;La/dyu;La/clc;La/pru;La/r9u;La/m1e;La/duj;La/mne;La/ctf0;La/yfm0;La/i1w0;La/g2v;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method
