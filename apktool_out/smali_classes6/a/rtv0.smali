.class public final synthetic La/rtv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/jtv0;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:B

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/jtv0;JJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rtv0;->a:La/mm40;

    iput-object p2, p0, La/rtv0;->b:La/jtv0;

    iput-wide p3, p0, La/rtv0;->c:J

    iput-wide p5, p0, La/rtv0;->d:J

    iput-byte p7, p0, La/rtv0;->e:B

    iput-boolean p8, p0, La/rtv0;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-byte p1, p0, La/rtv0;->e:B

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, La/rtv0;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/rtv0;->b:La/jtv0;

    .line 20
    .line 21
    iget-wide v2, p0, La/rtv0;->c:J

    .line 22
    .line 23
    iget-wide v4, p0, La/rtv0;->d:J

    .line 24
    .line 25
    iget-boolean v8, p0, La/rtv0;->f:Z

    .line 26
    .line 27
    invoke-static/range {v0 .. v8}, La/btm0;->a(La/mm40;La/jtv0;JJLa/fet;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
