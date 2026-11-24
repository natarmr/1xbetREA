.class public final La/cxn0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/List;

.field public j:Ljava/util/Map;

.field public k:Ljava/util/List;

.field public l:Ljava/lang/Throwable;

.field public m:J

.field public n:J

.field public o:I

.field public p:I

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/z220;

.field public t:I


# direct methods
.method public constructor <init>(La/z220;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cxn0;->s:La/z220;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/cxn0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/cxn0;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/cxn0;->t:I

    .line 9
    .line 10
    iget-object p1, p0, La/cxn0;->s:La/z220;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p0, v0, v0}, La/z220;->w(La/zje;Ljava/lang/String;Ljava/util/List;)Ljava/io/Serializable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
