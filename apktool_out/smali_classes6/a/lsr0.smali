.class public final synthetic La/lsr0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/lsr0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/lsr0;

    .line 2
    .line 3
    const-string v4, "toTotoJackpotUiState(Lorg/xplatform/toto_jackpot/impl/presentation/compose/jackpot/udf/TotoJackpotState;)Lorg/xplatform/toto_jackpot/impl/presentation/compose/jackpot/udf/TotoJackpotUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/rsr0;

    .line 8
    .line 9
    const-string v3, "toTotoJackpotUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/lsr0;->a:La/lsr0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/tqr0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, La/tqr0;->a:La/y7y;

    .line 7
    .line 8
    iget-object v2, p1, La/tqr0;->b:La/e3y;

    .line 9
    .line 10
    iget-object v4, p1, La/tqr0;->f:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p1, La/tqr0;->d:La/in8;

    .line 13
    .line 14
    iget-boolean v5, p1, La/tqr0;->c:Z

    .line 15
    .line 16
    iget-object v6, p1, La/tqr0;->g:La/kfk0;

    .line 17
    .line 18
    new-instance v0, La/qsr0;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, La/qsr0;-><init>(La/y7y;La/e3y;La/in8;Ljava/lang/String;ZLa/kfk0;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
