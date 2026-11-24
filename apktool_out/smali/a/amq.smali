.class public final synthetic La/amq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/yjj0;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:La/slq;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/mm40;La/yjj0;JJLa/slq;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/amq;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/amq;->b:La/mm40;

    iput-object p3, p0, La/amq;->c:La/yjj0;

    iput-wide p4, p0, La/amq;->d:J

    iput-wide p6, p0, La/amq;->e:J

    iput-object p8, p0, La/amq;->f:La/slq;

    iput-object p9, p0, La/amq;->g:La/ugd;

    iput p10, p0, La/amq;->h:I

    iput-byte p11, p0, La/amq;->i:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/amq;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La/amq;->a:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    iget-object v1, p0, La/amq;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/amq;->c:La/yjj0;

    .line 22
    .line 23
    iget-wide v3, p0, La/amq;->d:J

    .line 24
    .line 25
    iget-wide v5, p0, La/amq;->e:J

    .line 26
    .line 27
    iget-object v7, p0, La/amq;->f:La/slq;

    .line 28
    .line 29
    iget-object v8, p0, La/amq;->g:La/ugd;

    .line 30
    .line 31
    iget-byte v11, p0, La/amq;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v11}, La/dmq;->a(Lkotlin/jvm/functions/Function0;La/mm40;La/yjj0;JJLa/slq;La/ugd;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
