.class public final La/e0p;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/zn00;

.field public final c:La/v88;

.field public final d:La/b8u;

.field public final e:La/iqt;

.field public final f:La/khf0;

.field public final g:La/trm0;

.field public final h:La/i1w0;

.field public final i:La/duj;

.field public j:J

.field public final k:La/qoj0;


# direct methods
.method public constructor <init>(La/zn00;La/v88;La/b8u;La/iqt;La/khf0;La/trm0;La/i1w0;La/duj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e0p;->b:La/zn00;

    .line 5
    .line 6
    iput-object p2, p0, La/e0p;->c:La/v88;

    .line 7
    .line 8
    iput-object p3, p0, La/e0p;->d:La/b8u;

    .line 9
    .line 10
    iput-object p4, p0, La/e0p;->e:La/iqt;

    .line 11
    .line 12
    iput-object p5, p0, La/e0p;->f:La/khf0;

    .line 13
    .line 14
    iput-object p6, p0, La/e0p;->g:La/trm0;

    .line 15
    .line 16
    iput-object p7, p0, La/e0p;->h:La/i1w0;

    .line 17
    .line 18
    iput-object p8, p0, La/e0p;->i:La/duj;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    const/4 p2, 0x7

    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-static {p3, p3, p1, p2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/e0p;->k:La/qoj0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final w(La/b0p;)V
    .locals 4

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/j0l;

    .line 6
    .line 7
    const/16 v2, 0xe

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v3, v2}, La/j0l;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method
