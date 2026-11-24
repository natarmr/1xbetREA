.class public final La/vg20;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:D

.field public m:D

.field public n:D

.field public o:D

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:B

.field public v:Ljava/lang/String;

.field public w:La/ezc;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:La/w5z;

.field public z:I


# direct methods
.method public constructor <init>(La/w5z;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vg20;->y:La/w5z;

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, La/vg20;->x:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, La/vg20;->z:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, La/vg20;->z:I

    .line 13
    .line 14
    const/16 v22, 0x0

    .line 15
    .line 16
    const/16 v23, 0x0

    .line 17
    .line 18
    iget-object v1, v0, La/vg20;->y:La/w5z;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const-wide/16 v12, 0x0

    .line 31
    .line 32
    const-wide/16 v14, 0x0

    .line 33
    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    const-wide/16 v17, 0x0

    .line 37
    .line 38
    const/16 v19, 0x0

    .line 39
    .line 40
    const/16 v20, 0x0

    .line 41
    .line 42
    const/16 v21, 0x0

    .line 43
    .line 44
    move-object/from16 v24, v0

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v24}, La/w5z;->R(JDDDZIJDLjava/lang/String;JZZLa/ezc;ZILa/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
