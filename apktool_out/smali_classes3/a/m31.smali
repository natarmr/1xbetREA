.class public final La/m31;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n31;

.field public l:I


# direct methods
.method public constructor <init>(La/n31;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m31;->k:La/n31;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, La/m31;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, La/m31;->l:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, La/m31;->l:I

    .line 13
    .line 14
    const/4 v14, 0x0

    .line 15
    const/4 v15, 0x0

    .line 16
    iget-object v1, v0, La/m31;->k:La/n31;

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    move-object/from16 v16, v0

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v16}, La/n31;->a(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLa/zje;)Ljava/io/Serializable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
