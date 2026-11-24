.class public final La/ave;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/q4f;

.field public b:J

.field public c:La/ql5;

.field public d:Ljava/lang/String;

.field public e:D

.field public f:D

.field public g:D

.field public h:Z

.field public i:La/p0g0;

.field public final j:Ljava/util/LinkedHashMap;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:La/qoj0;

.field public final p:La/qoj0;

.field public final q:La/qoj0;

.field public final r:La/p7m0;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/q4f;->b:La/q4f;

    .line 5
    .line 6
    iput-object v0, p0, La/ave;->a:La/q4f;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, La/ave;->d:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/ave;->j:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/ave;->k:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/ave;->l:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/ave;->m:Ljava/util/ArrayList;

    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/ave;->n:Ljava/util/ArrayList;

    .line 46
    .line 47
    sget-object v0, La/i99;->b:La/i99;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-static {v1, v2, v0}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-object v3, p0, La/ave;->o:La/qoj0;

    .line 56
    .line 57
    invoke-static {v2, v2, v0}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, La/ave;->p:La/qoj0;

    .line 62
    .line 63
    invoke-static {v1, v2, v0}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/ave;->q:La/qoj0;

    .line 68
    .line 69
    sget-object v0, La/jit0;->a:La/jit0;

    .line 70
    .line 71
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/ave;->r:La/p7m0;

    .line 76
    .line 77
    return-void
.end method
