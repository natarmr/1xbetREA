.class public final La/wru;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:Z

.field public k:La/ql5;

.field public l:La/bsu;

.field public m:La/bm5;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/jrt;

.field public p:I


# direct methods
.method public constructor <init>(La/jrt;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wru;->o:La/jrt;

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
    .locals 2

    .line 1
    iput-object p1, p0, La/wru;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/wru;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/wru;->p:I

    .line 9
    .line 10
    iget-object p1, p0, La/wru;->o:La/jrt;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/jrt;->a(JLa/zje;)Ljava/io/Serializable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
