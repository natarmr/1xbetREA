.class public final La/ini;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j0h0;


# instance fields
.field public final synthetic a:La/eni;


# direct methods
.method public constructor <init>(La/eni;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ini;->a:La/eni;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;La/i1w0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 2
    .line 3
    iget-object p0, p0, La/ini;->a:La/eni;

    .line 4
    .line 5
    iget-object p0, p0, La/eni;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ru;

    .line 8
    .line 9
    iget-object v1, p0, La/ru;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, La/we50;

    .line 13
    .line 14
    iget-object v1, p0, La/ru;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/lef0;

    .line 17
    .line 18
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/gbi;

    .line 21
    .line 22
    invoke-virtual {v1}, La/gbi;->z()La/mxg0;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v1, p0, La/ru;->f:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v5, v1

    .line 29
    check-cast v5, La/zn00;

    .line 30
    .line 31
    iget-object v1, p0, La/ru;->g:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v6, v1

    .line 34
    check-cast v6, La/ort;

    .line 35
    .line 36
    iget-object v1, p0, La/ru;->c:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v7, v1

    .line 39
    check-cast v7, La/cyh;

    .line 40
    .line 41
    iget-object v1, p0, La/ru;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, La/lef0;

    .line 44
    .line 45
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, La/gbi;

    .line 48
    .line 49
    new-instance v8, La/e0c;

    .line 50
    .line 51
    invoke-virtual {v1}, La/gbi;->G()La/n660;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v8, v1}, La/e0c;-><init>(La/n660;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/ru;->d:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v9, v1

    .line 61
    check-cast v9, La/z4w0;

    .line 62
    .line 63
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/cad;

    .line 66
    .line 67
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/psc;

    .line 70
    .line 71
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/ru;->b:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v11, v1

    .line 81
    check-cast v11, La/duj;

    .line 82
    .line 83
    iget-object p0, p0, La/ru;->h:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v12, p0

    .line 86
    check-cast v12, La/m1e;

    .line 87
    .line 88
    move-object v1, p1

    .line 89
    move-object v2, p2

    .line 90
    invoke-direct/range {v0 .. v12}, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;-><init>(La/vzg0;La/i1w0;La/we50;La/mxg0;La/zn00;La/ort;La/cyh;La/e0c;La/z4w0;La/mne;La/duj;La/m1e;)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method
