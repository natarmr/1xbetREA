.class public final synthetic La/hu60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/y9q0;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/y9q0;JLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hu60;->a:Ljava/lang/String;

    iput-object p2, p0, La/hu60;->b:La/y9q0;

    iput-wide p3, p0, La/hu60;->c:J

    iput-object p5, p0, La/hu60;->d:Ljava/lang/String;

    iput-object p6, p0, La/hu60;->e:Ljava/lang/String;

    iput-byte p8, p0, La/hu60;->f:B

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
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    iget-object v0, p0, La/hu60;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, La/hu60;->b:La/y9q0;

    .line 17
    .line 18
    iget-wide v2, p0, La/hu60;->c:J

    .line 19
    .line 20
    iget-object v4, p0, La/hu60;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, p0, La/hu60;->e:Ljava/lang/String;

    .line 23
    .line 24
    iget-byte v8, p0, La/hu60;->f:B

    .line 25
    .line 26
    invoke-static/range {v0 .. v8}, La/jiq0;->j(Ljava/lang/String;La/y9q0;JLjava/lang/String;Ljava/lang/String;La/fet;II)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
