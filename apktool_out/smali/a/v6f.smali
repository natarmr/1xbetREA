.class public final synthetic La/v6f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/r7f;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(La/r7f;JJJJZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6f;->a:La/r7f;

    iput-wide p2, p0, La/v6f;->b:J

    iput-wide p4, p0, La/v6f;->c:J

    iput-wide p6, p0, La/v6f;->d:J

    iput-wide p8, p0, La/v6f;->e:J

    iput-boolean p10, p0, La/v6f;->f:Z

    iput-boolean p11, p0, La/v6f;->g:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/k0w0;

    .line 6
    .line 7
    iget-object v2, v0, La/v6f;->a:La/r7f;

    .line 8
    .line 9
    iget-object v2, v2, La/r7f;->E0:La/qv2;

    .line 10
    .line 11
    sget-object v16, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 12
    .line 13
    sget-object v17, La/grs;->b:La/grs;

    .line 14
    .line 15
    sget-object v20, La/ors;->a:La/ors;

    .line 16
    .line 17
    sget-object v23, La/k1g;->h:La/k1g;

    .line 18
    .line 19
    new-instance v3, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 20
    .line 21
    const/16 v21, 0x0

    .line 22
    .line 23
    const/16 v22, 0x0

    .line 24
    .line 25
    iget-wide v4, v0, La/v6f;->b:J

    .line 26
    .line 27
    iget-wide v6, v0, La/v6f;->c:J

    .line 28
    .line 29
    iget-wide v8, v0, La/v6f;->d:J

    .line 30
    .line 31
    iget-wide v10, v0, La/v6f;->e:J

    .line 32
    .line 33
    iget-boolean v12, v0, La/v6f;->f:Z

    .line 34
    .line 35
    const-wide/16 v13, 0x0

    .line 36
    .line 37
    iget-boolean v15, v0, La/v6f;->g:Z

    .line 38
    .line 39
    const-string v18, "main_screen"

    .line 40
    .line 41
    const-string v19, ""

    .line 42
    .line 43
    invoke-direct/range {v3 .. v23}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, La/k0w0;->c(La/m7h0;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0
.end method
