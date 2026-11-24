.class public final La/jhf0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:I

.field public l:Z

.field public m:La/q4f;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/wdu;

.field public p:I


# direct methods
.method public constructor <init>(La/wdu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jhf0;->o:La/wdu;

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
    .locals 6

    .line 1
    iput-object p1, p0, La/jhf0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/jhf0;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/jhf0;->p:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, La/jhf0;->o:La/wdu;

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    move-object v4, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/wdu;->u(IJLa/zje;Z)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
