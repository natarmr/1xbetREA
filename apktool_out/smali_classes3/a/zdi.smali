.class public final La/zdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zdi;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 12

    .line 1
    new-instance v0, La/u8g;

    .line 2
    .line 3
    iget-object p0, p0, La/zdi;->a:La/uci;

    .line 4
    .line 5
    iget-object p0, p0, La/uci;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ru;

    .line 8
    .line 9
    iget-object v1, p0, La/ru;->h:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/m1e;

    .line 13
    .line 14
    iget-object v1, p0, La/ru;->a:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v1

    .line 17
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 18
    .line 19
    iget-object v1, p0, La/ru;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    new-instance v5, La/fhj;

    .line 28
    .line 29
    new-instance v1, La/z1u;

    .line 30
    .line 31
    iget-object v6, p0, La/ru;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, La/ul9;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    invoke-direct {v1, v6, v7}, La/z1u;-><init>(La/ul9;B)V

    .line 37
    .line 38
    .line 39
    new-instance v8, La/uyn;

    .line 40
    .line 41
    invoke-direct {v8, v6}, La/uyn;-><init>(La/ul9;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v5, v1, v8}, La/fhj;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v1, v6

    .line 48
    new-instance v6, La/b3u;

    .line 49
    .line 50
    iget-object v8, p0, La/ru;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, La/sjl0;

    .line 53
    .line 54
    invoke-direct {v6, v8, v7}, La/b3u;-><init>(La/sjl0;B)V

    .line 55
    .line 56
    .line 57
    iget-object v7, p0, La/ru;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, La/iip;

    .line 60
    .line 61
    invoke-interface {v7}, La/iip;->V()La/j3c;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v8, La/y1u;

    .line 69
    .line 70
    const/4 v9, 0x1

    .line 71
    invoke-direct {v8, v1, v9}, La/y1u;-><init>(La/ul9;B)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, La/ru;->g:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v9, v1

    .line 77
    check-cast v9, La/g2v;

    .line 78
    .line 79
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/cad;

    .line 82
    .line 83
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, La/psc;

    .line 86
    .line 87
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, La/ru;->b:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v11, p0

    .line 97
    check-cast v11, La/duj;

    .line 98
    .line 99
    move-object v1, p1

    .line 100
    invoke-direct/range {v0 .. v11}, La/u8g;-><init>(La/vzg0;La/m1e;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;ZLa/fhj;La/b3u;La/j3c;La/y1u;La/g2v;La/mne;La/duj;)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method
