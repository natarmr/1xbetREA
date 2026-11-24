.class public final La/wu4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h1w0;

.field public final b:La/gdv0;


# direct methods
.method public constructor <init>(La/h1w0;La/gdv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wu4;->a:La/h1w0;

    .line 5
    .line 6
    iput-object p2, p0, La/wu4;->b:La/gdv0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/lf50;La/g1w0;)Lkotlin/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/wu4;->b:La/gdv0;

    .line 5
    .line 6
    sget-object v0, Lorg/xplatform/core/navigation/authorization/model/AuthType;->a:Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, La/gdv0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, La/iun;->a:La/iun;

    .line 17
    .line 18
    new-instance p2, Lkotlin/Pair;

    .line 19
    .line 20
    invoke-direct {p2, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    iget-object v0, p1, La/lf50;->c:La/pe50;

    .line 25
    .line 26
    invoke-static {p1}, La/qxw;->A(La/lf50;)La/wul0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v8, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, La/wul0;->a()La/m7h0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v1, v8

    .line 39
    :goto_0
    if-nez p2, :cond_2

    .line 40
    .line 41
    iget-object p2, p1, La/lf50;->c:La/pe50;

    .line 42
    .line 43
    iget-object p2, p2, La/pe50;->b:La/g1w0;

    .line 44
    .line 45
    :cond_2
    move-object v2, p2

    .line 46
    const/4 v6, 0x0

    .line 47
    const/16 v7, 0x3c

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static/range {v0 .. v7}, La/pe50;->a(La/pe50;La/m7h0;La/g1w0;La/bjk;La/pu4;Ljava/util/List;Ljava/util/List;I)La/pe50;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v0, p2, La/pe50;->d:La/pu4;

    .line 57
    .line 58
    iget-object v0, v0, La/pu4;->a:La/bjk;

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-static {p1, v8, v8, p2, v1}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object p2, La/nu4;->a:La/nu4;

    .line 66
    .line 67
    invoke-static {p1, p2, p0, v0}, La/qxw;->P(La/lf50;La/nu4;Lorg/xplatform/core/navigation/authorization/screen/Authorization;La/bjk;)La/lf50;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    instance-of p2, p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    new-instance p2, La/le50;

    .line 76
    .line 77
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 78
    .line 79
    invoke-direct {p2, p0, v0}, La/le50;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;La/bjk;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    new-instance p2, La/fe50;

    .line 84
    .line 85
    invoke-direct {p2, p0}, La/fe50;-><init>(La/m7h0;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p2, Lkotlin/Pair;

    .line 93
    .line 94
    invoke-direct {p2, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object p2
.end method
