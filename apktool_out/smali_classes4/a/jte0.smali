.class public final La/jte0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/ite0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/ite0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/jte0;->Companion:La/ite0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    if-ne v2, v0, :cond_4

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/jte0;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput p3, p0, La/jte0;->b:I

    .line 13
    .line 14
    and-int/lit8 p2, p1, 0x4

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    iput-object v1, p0, La/jte0;->c:Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object p4, p0, La/jte0;->c:Ljava/lang/String;

    .line 22
    .line 23
    :goto_0
    and-int/lit8 p2, p1, 0x8

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iput-object v1, p0, La/jte0;->d:Ljava/lang/Boolean;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iput-object p5, p0, La/jte0;->d:Ljava/lang/Boolean;

    .line 31
    .line 32
    :goto_1
    and-int/lit8 p2, p1, 0x10

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    iput-object v1, p0, La/jte0;->e:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iput-object p6, p0, La/jte0;->e:Ljava/lang/String;

    .line 40
    .line 41
    :goto_2
    and-int/lit8 p1, p1, 0x20

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iput-object v1, p0, La/jte0;->f:Ljava/lang/String;

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iput-object p7, p0, La/jte0;->f:Ljava/lang/String;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    sget-object p0, La/hte0;->a:La/hte0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/hte0;->getDescriptor()La/ugi0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p2, p0, La/jte0;->a:Ljava/lang/String;

    .line 63
    iput p1, p0, La/jte0;->b:I

    .line 64
    iput-object p3, p0, La/jte0;->c:Ljava/lang/String;

    const/4 p1, 0x0

    .line 65
    iput-object p1, p0, La/jte0;->d:Ljava/lang/Boolean;

    .line 66
    iput-object p4, p0, La/jte0;->e:Ljava/lang/String;

    .line 67
    iput-object p5, p0, La/jte0;->f:Ljava/lang/String;

    return-void
.end method
