.class public final La/e1f;
.super La/zje;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public Y:Z

.field public Z:Z

.field public f1:Z

.field public g1:Z

.field public synthetic h1:Ljava/lang/Object;

.field public i:J

.field public final synthetic i1:La/g45;

.field public j:J

.field public j1:I

.field public k:J

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:B

.field public q:I

.field public r:I

.field public s:I

.field public t:Ljava/util/List;

.field public u:Ljava/lang/String;

.field public v:Ljava/util/List;

.field public w:Ljava/lang/Boolean;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/Integer;

.field public z:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(La/g45;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/e1f;->i1:La/g45;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, La/e1f;->h1:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, La/e1f;->j1:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, La/e1f;->j1:I

    .line 13
    .line 14
    const/16 v21, 0x0

    .line 15
    .line 16
    const/16 v22, 0x0

    .line 17
    .line 18
    iget-object v1, v0, La/e1f;->i1:La/g45;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const-wide/16 v7, 0x0

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v15, 0x0

    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    const/16 v17, 0x0

    .line 37
    .line 38
    const/16 v18, 0x0

    .line 39
    .line 40
    const/16 v19, 0x0

    .line 41
    .line 42
    const/16 v20, 0x0

    .line 43
    .line 44
    move-object/from16 v23, v0

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v23}, La/g45;->k0(JJIJLjava/util/List;ILjava/lang/String;Ljava/util/List;ZZZZZLjava/lang/Boolean;Ljava/lang/String;ILjava/lang/Integer;ZLa/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
