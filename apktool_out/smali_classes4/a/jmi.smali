.class public final La/jmi;
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
    iput-object p1, p0, La/jmi;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/gl60;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/jmi;->a:La/rki;

    .line 6
    .line 7
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/kmi;

    .line 10
    .line 11
    iget-object v2, v1, La/kmi;->a:La/mne;

    .line 12
    .line 13
    iget-object v3, v1, La/kmi;->b:La/nr00;

    .line 14
    .line 15
    iget-object v3, v3, La/nr00;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/ru;

    .line 18
    .line 19
    invoke-virtual {v3}, La/ru;->i()La/ggu;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, v1, La/kmi;->b:La/nr00;

    .line 24
    .line 25
    iget-object v5, v4, La/nr00;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, La/ru;

    .line 28
    .line 29
    new-instance v6, La/onv;

    .line 30
    .line 31
    invoke-virtual {v5}, La/ru;->u()La/nv20;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-direct {v6, v5}, La/onv;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v5, v4, La/nr00;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, La/ru;

    .line 41
    .line 42
    invoke-virtual {v5}, La/ru;->f()La/rdd;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v4, v4, La/nr00;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, La/ru;

    .line 49
    .line 50
    move-object v7, v4

    .line 51
    move-object v4, v6

    .line 52
    new-instance v6, La/eke0;

    .line 53
    .line 54
    invoke-virtual {v7}, La/ru;->u()La/nv20;

    .line 55
    .line 56
    .line 57
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v7, v1, La/kmi;->c:La/ctf0;

    .line 61
    .line 62
    iget-object v8, v1, La/kmi;->d:La/wsf0;

    .line 63
    .line 64
    iget-object v8, v8, La/wsf0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v8, La/g45;

    .line 67
    .line 68
    invoke-virtual {v8}, La/g45;->y()La/ahu;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iget-object v9, v1, La/kmi;->e:La/r990;

    .line 73
    .line 74
    iget-object v10, v1, La/kmi;->f:La/v6k;

    .line 75
    .line 76
    iget-object v10, v10, La/v6k;->a:La/efi;

    .line 77
    .line 78
    invoke-virtual {v10}, La/efi;->a()La/rqt;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    iget-object v11, v1, La/kmi;->g:La/i1w0;

    .line 83
    .line 84
    new-instance v12, La/ih5;

    .line 85
    .line 86
    iget-object v13, v1, La/kmi;->h:La/kt2;

    .line 87
    .line 88
    const/4 v14, 0x4

    .line 89
    invoke-direct {v12, v13, v14}, La/ih5;-><init>(La/kt2;B)V

    .line 90
    .line 91
    .line 92
    iget-object v13, v1, La/kmi;->i:La/ix0;

    .line 93
    .line 94
    iget-object v14, v1, La/kmi;->j:La/l7k;

    .line 95
    .line 96
    iget-object v15, v1, La/kmi;->k:La/ih5;

    .line 97
    .line 98
    move-object/from16 v1, p1

    .line 99
    .line 100
    invoke-direct/range {v0 .. v15}, La/gl60;-><init>(La/vzg0;La/mne;La/ggu;La/onv;La/rdd;La/eke0;La/ctf0;La/ahu;La/r990;La/rqt;La/i1w0;La/ih5;La/ix0;La/l7k;La/ih5;)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method
