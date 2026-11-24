.class public final synthetic La/sea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sea;->a:La/mm40;

    iput-object p2, p0, La/sea;->b:Ljava/lang/String;

    iput-wide p3, p0, La/sea;->c:J

    iput-byte p5, p0, La/sea;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-byte p1, p0, La/sea;->d:B

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-wide v1, p0, La/sea;->c:J

    .line 18
    .line 19
    iget-object v4, p0, La/sea;->a:La/mm40;

    .line 20
    .line 21
    iget-object v5, p0, La/sea;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, La/fre0;->n(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
