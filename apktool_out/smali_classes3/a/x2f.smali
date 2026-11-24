.class public final La/x2f;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/q1h0;

.field public j:La/h0q0;

.field public k:Ljava/lang/String;

.field public l:La/s77;

.field public m:Ljava/lang/String;

.field public n:Z

.field public o:I

.field public p:J

.field public q:Z

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/a3f;

.field public t:I


# direct methods
.method public constructor <init>(La/a3f;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x2f;->s:La/a3f;

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
    iput-object p1, p0, La/x2f;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/x2f;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/x2f;->t:I

    .line 9
    .line 10
    iget-object p1, p0, La/x2f;->s:La/a3f;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/a3f;->N(La/zje;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
