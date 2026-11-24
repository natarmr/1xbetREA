.class public final La/p5s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:La/vne;

.field public final synthetic c:La/t33;

.field public final synthetic d:La/o6s0;

.field public final synthetic e:La/sjj;

.field public final synthetic f:La/ngk0;

.field public final synthetic g:J


# direct methods
.method public constructor <init>(La/pz40;La/vne;La/t33;La/o6s0;La/sjj;La/ngk0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p5s0;->a:La/pz40;

    .line 5
    .line 6
    iput-object p2, p0, La/p5s0;->b:La/vne;

    .line 7
    .line 8
    iput-object p3, p0, La/p5s0;->c:La/t33;

    .line 9
    .line 10
    iput-object p4, p0, La/p5s0;->d:La/o6s0;

    .line 11
    .line 12
    iput-object p5, p0, La/p5s0;->e:La/sjj;

    .line 13
    .line 14
    iput-object p6, p0, La/p5s0;->f:La/ngk0;

    .line 15
    .line 16
    iput-wide p7, p0, La/p5s0;->g:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance v1, La/mie0;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/j6u0;

    .line 7
    .line 8
    invoke-direct {v0}, La/j6u0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, v1, La/mie0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, La/q6q0;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    iget-object v2, p0, La/p5s0;->a:La/pz40;

    .line 17
    .line 18
    iget-object v3, p0, La/p5s0;->b:La/vne;

    .line 19
    .line 20
    iget-object v4, p0, La/p5s0;->c:La/t33;

    .line 21
    .line 22
    iget-object v5, p0, La/p5s0;->d:La/o6s0;

    .line 23
    .line 24
    move-object v10, v2

    .line 25
    move-object v2, v1

    .line 26
    move-object v1, v10

    .line 27
    invoke-direct/range {v0 .. v6}, La/q6q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    move-object v8, v2

    .line 31
    move-object v2, v1

    .line 32
    move-object v1, v8

    .line 33
    move-object v8, v0

    .line 34
    new-instance v0, La/co0;

    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    iget-object v6, p0, La/p5s0;->e:La/sjj;

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, La/co0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    move-object v7, v0

    .line 44
    new-instance v9, La/sbe0;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {v9, v1, v0}, La/sbe0;-><init>(La/mie0;B)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/ds8;

    .line 51
    .line 52
    const/4 v6, 0x6

    .line 53
    iget-object v2, p0, La/p5s0;->f:La/ngk0;

    .line 54
    .line 55
    iget-wide v3, p0, La/p5s0;->g:J

    .line 56
    .line 57
    move-object v10, v5

    .line 58
    move-object v5, v1

    .line 59
    move-object v1, v10

    .line 60
    invoke-direct/range {v0 .. v6}, La/ds8;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    move-object v2, p1

    .line 64
    move-object v6, v0

    .line 65
    move-object v4, v7

    .line 66
    move-object v3, v8

    .line 67
    move-object v5, v9

    .line 68
    move-object v7, p2

    .line 69
    invoke-static/range {v2 .. v7}, La/bel;->e(La/hpa0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, La/wne;->a:La/wne;

    .line 74
    .line 75
    if-ne p0, p1, :cond_0

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0
.end method
