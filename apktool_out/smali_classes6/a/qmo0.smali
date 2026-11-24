.class public final synthetic La/qmo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/weu;

.field public final synthetic b:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

.field public final synthetic c:La/qzt;

.field public final synthetic d:La/ctf0;

.field public final synthetic e:La/fhj;

.field public final synthetic f:J

.field public final synthetic g:La/wyu;

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/weu;Lorg/xplatform/statistic/stage/api/domain/TypeStageId;La/qzt;La/ctf0;La/fhj;JLa/wyu;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qmo0;->a:La/weu;

    iput-object p2, p0, La/qmo0;->b:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    iput-object p3, p0, La/qmo0;->c:La/qzt;

    iput-object p4, p0, La/qmo0;->d:La/ctf0;

    iput-object p5, p0, La/qmo0;->e:La/fhj;

    iput-wide p6, p0, La/qmo0;->f:J

    iput-object p8, p0, La/qmo0;->g:La/wyu;

    iput-wide p9, p0, La/qmo0;->h:J

    iput-object p11, p0, La/qmo0;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/qmo0;->b:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/xplatform/statistic/stage/api/domain/c;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, La/qmo0;->a:La/weu;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, La/qmo0;->c:La/qzt;

    .line 14
    .line 15
    invoke-virtual {v2}, La/qzt;->a()La/eme;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, La/qmo0;->d:La/ctf0;

    .line 20
    .line 21
    invoke-static {v1, v2, v3}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-static {v0}, Lorg/xplatform/statistic/stage/api/domain/c;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v0, p0, La/qmo0;->g:La/wyu;

    .line 30
    .line 31
    invoke-virtual {v0}, La/wyu;->a()La/uaq0;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v1, p0, La/qmo0;->e:La/fhj;

    .line 36
    .line 37
    iget-wide v3, p0, La/qmo0;->f:J

    .line 38
    .line 39
    iget-wide v6, p0, La/qmo0;->h:J

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v7}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    sget-object v8, La/iun;->a:La/iun;

    .line 46
    .line 47
    new-instance v4, La/x2m0;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v5, 0x1

    .line 52
    iget-object v11, p0, La/qmo0;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct/range {v4 .. v11}, La/x2m0;-><init>(ZZLa/pdt0;Ljava/util/List;La/zdm0;La/nc5;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v4
.end method
