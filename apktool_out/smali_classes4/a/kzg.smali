.class public final synthetic La/kzg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/uzg;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/uzg;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kzg;->a:La/uzg;

    iput-wide p2, p0, La/kzg;->b:J

    iput-wide p4, p0, La/kzg;->c:J

    iput p6, p0, La/kzg;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/kzg;->a:La/uzg;

    .line 7
    .line 8
    iget-object v0, v0, La/uzg;->f:La/gr00;

    .line 9
    .line 10
    new-instance v1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 11
    .line 12
    iget-wide v2, p0, La/kzg;->b:J

    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    iget v4, p0, La/kzg;->d:I

    .line 20
    .line 21
    iget-wide v5, p0, La/kzg;->c:J

    .line 22
    .line 23
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 27
    .line 28
    invoke-direct {p0, v1, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
