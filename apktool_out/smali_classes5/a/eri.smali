.class public final La/eri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/ppi;


# direct methods
.method public constructor <init>(La/ppi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eri;->a:La/ppi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 9

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/hde0;

    .line 5
    .line 6
    iget-object p0, p0, La/eri;->a:La/ppi;

    .line 7
    .line 8
    iget-object p0, p0, La/ppi;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/ru;

    .line 11
    .line 12
    new-instance v2, La/xqc;

    .line 13
    .line 14
    invoke-virtual {p0}, La/ru;->s()La/pzu;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v2, p1}, La/xqc;-><init>(La/pzu;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, La/f5a;

    .line 22
    .line 23
    invoke-virtual {p0}, La/ru;->s()La/pzu;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v3, p1}, La/f5a;-><init>(La/pzu;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, La/f5a;

    .line 31
    .line 32
    invoke-virtual {p0}, La/ru;->s()La/pzu;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v4, p1}, La/f5a;-><init>(La/pzu;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/ru;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, La/pv00;

    .line 42
    .line 43
    iget-object p1, p1, La/pv00;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, La/w9i;

    .line 46
    .line 47
    invoke-virtual {p1}, La/w9i;->b()La/woc;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    new-instance v6, La/xqt;

    .line 52
    .line 53
    invoke-virtual {p0}, La/ru;->s()La/pzu;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v7, 0x4

    .line 58
    invoke-direct {v6, p1, v7}, La/xqt;-><init>(La/pzu;B)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, La/ru;->e:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v7, p1

    .line 64
    check-cast v7, La/ctf0;

    .line 65
    .line 66
    iget-object p0, p0, La/ru;->b:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v8, p0

    .line 69
    check-cast v8, La/duj;

    .line 70
    .line 71
    invoke-direct/range {v0 .. v8}, La/hde0;-><init>(La/i1w0;La/xqc;La/f5a;La/f5a;La/woc;La/xqt;La/ctf0;La/duj;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method
