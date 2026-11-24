.class public final La/pj20;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/on20;

.field public k:I


# direct methods
.method public constructor <init>(La/on20;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pj20;->j:La/on20;

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
    .locals 14

    .line 1
    iput-object p1, p0, La/pj20;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/pj20;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/pj20;->k:I

    .line 9
    .line 10
    const/4 v11, 0x0

    .line 11
    const/4 v12, 0x0

    .line 12
    iget-object v0, p0, La/pj20;->j:La/on20;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    move-object v13, p0

    .line 25
    invoke-virtual/range {v0 .. v13}, La/on20;->Y(La/q4f;JDDZZLjava/lang/String;Ljava/lang/String;La/ex4;La/zje;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
