.class Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/parser/Pipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Buffer"
.end annotation


# instance fields
.field bytes:[B

.field length:I

.field ptr:I

.field final synthetic this$0:Landroid/gov/nist/javax/sip/parser/Pipeline;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Pipeline;[BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->this$0:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 8
    .line 9
    iput p3, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->length:I

    .line 10
    .line 11
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->bytes:[B

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getNextByte()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 8
    .line 9
    aget-byte p0, v0, v1

    .line 10
    .line 11
    and-int/lit16 p0, p0, 0xff

    .line 12
    .line 13
    return p0
.end method
