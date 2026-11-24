.class public final La/g7q;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/h7q;

.field public k:I


# direct methods
.method public constructor <init>(La/h7q;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/g7q;->j:La/h7q;

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, La/g7q;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, La/g7q;->k:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, La/g7q;->k:I

    .line 13
    .line 14
    const/16 v26, 0x0

    .line 15
    .line 16
    const/16 v27, 0x0

    .line 17
    .line 18
    iget-object v1, v0, La/g7q;->j:La/h7q;

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
    const-wide/16 v22, 0x0

    .line 45
    .line 46
    const/16 v24, 0x0

    .line 47
    .line 48
    const/16 v25, 0x0

    .line 49
    .line 50
    move-object/from16 v28, v0

    .line 51
    .line 52
    invoke-virtual/range {v1 .. v28}, La/h7q;->c(JDDDZIJDLjava/lang/String;JZZLa/ql5;JLa/ezc;IZILa/zje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
